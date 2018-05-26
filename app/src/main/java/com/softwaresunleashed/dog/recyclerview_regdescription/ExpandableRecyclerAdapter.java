package com.softwaresunleashed.dog.recyclerview_regdescription;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.softwaresunleashed.dog.R;
import com.softwaresunleashed.dog.debugregs.base_classes.RegBitField;
import com.softwaresunleashed.dog.debugregs.base_classes.ValidValues;
import com.softwaresunleashed.dog.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class ExpandableRecyclerAdapter extends RecyclerView.Adapter<ExpandableRecyclerAdapter.ViewHolder> {

    private List<RegisterDetailsHolder> registerList;
    private SparseBooleanArray expandState = new SparseBooleanArray();
    private Context context;

    public ExpandableRecyclerAdapter(List<RegisterDetailsHolder> registerList) {
        this.registerList = registerList;
        //set initial expanded state to false
        for (int i = 0; i < registerList.size(); i++) {
            expandState.append(i, false);
        }
    }

    @Override
    public ExpandableRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.context = viewGroup.getContext();
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.expandable_card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ExpandableRecyclerAdapter.ViewHolder viewHolder, final  int i) {

        viewHolder.setIsRecyclable(false);

        viewHolder.tvName.setText(registerList.get(i).getRegisterName());
        viewHolder.tvRegAddr.setText("0x" + registerList.get(i).getRegisterAddress());
        viewHolder.tvRegValue.setText(registerList.get(i).getRegisterValue());
        viewHolder.tvRegDesc.setText(registerList.get(i).getRegisterDescription());

        ArrayList<RegBitField> rbfList = registerList.get(i).getRegisterBitField();
        if(rbfList != null){
            for (RegBitField rbf: rbfList) {

                try{
                    TableRow tr = new TableRow(this.context);
                    tr.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

                    // Bit Field description
                    TextView tvBitField = new TextView(this.context);
                    if(rbf.end_bit == rbf.start_bit){
                        tvBitField.setText("[" + String.valueOf(rbf.end_bit) + "]");
                    } else {
                        tvBitField.setText("[" + String.valueOf(rbf.end_bit) + ":" + String.valueOf(rbf.start_bit) + "]");
                    }
                    tvBitField.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT));


                    TextView tvFieldName = new TextView(this.context);
                    tvFieldName.setText(rbf.field_function);
                    tvFieldName.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

                    TextView tvFieldFunction = new TextView(this.context);
                    tvFieldFunction.setText(rbf.field_name);
                    tvFieldFunction.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

                    TextView tvFieldValidValueMeaning = new TextView(this.context);
                    long register_value = Utils.HexToLong(registerList.get(i).getRegisterValue()).longValue();
                    long field_value = Utils.bitExtracted(register_value, (rbf.end_bit-rbf.start_bit+1), rbf.end_bit);
                    String meaning = "Undefined";
                    for (ValidValues validValues: rbf.validValuesArrayList) {
                        if (validValues.getValue() == field_value)
                            meaning = validValues.getMeaning();
                    }
                    tvFieldValidValueMeaning.setText(field_value + ":" + meaning);
                    tvFieldValidValueMeaning.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT));



                    /* Add Views to row. */
                    tr.addView(tvBitField);
                    tr.addView(tvFieldName);
                    //tr.addView(tvFieldFunction);
                    tr.addView(tvFieldValidValueMeaning);


                    /* Add row to TableLayout. */
                    viewHolder.tl_analysis_table.addView(tr, new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }


        //check if view is expanded
        final boolean isExpanded = expandState.get(i);
        viewHolder.expandableLayout.setVisibility(isExpanded?View.VISIBLE:View.GONE);

        viewHolder.buttonLayout.setRotation(expandState.get(i) ? 180f : 0f);
        viewHolder.buttonLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                onClickButton(viewHolder.expandableLayout, viewHolder.buttonLayout,  i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return registerList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView tvName, tvRegValue, tvRegAddr, tvRegDesc;
        public RelativeLayout buttonLayout;
        public LinearLayout expandableLayout;
        private TableLayout tl_analysis_table;

        public ViewHolder(View view) {
            super(view);

            tvName = (TextView)view.findViewById(R.id.tv_regName);
            tvRegAddr = (TextView)view.findViewById(R.id.tv_regAddress);
            tvRegValue = (TextView)view.findViewById(R.id.tv_regValue);
            tvRegDesc = (TextView)view.findViewById(R.id.tv_regdesc);

            buttonLayout = (RelativeLayout) view.findViewById(R.id.button);
            expandableLayout = (LinearLayout) view.findViewById(R.id.expandableLayout);
            tl_analysis_table = (TableLayout) view.findViewById(R.id.tl_analysis_table);

        }
    }

    private void onClickButton(final LinearLayout expandableLayout, final RelativeLayout buttonLayout, final  int i) {

        //Simply set View to Gone if not expanded
        //Not necessary but I put simple rotation on button layout
        if (expandableLayout.getVisibility() == View.VISIBLE){
            createRotateAnimator(buttonLayout, 180f, 0f).start();
            expandableLayout.setVisibility(View.GONE);
            expandState.put(i, false);
        }else{
            createRotateAnimator(buttonLayout, 0f, 180f).start();
            expandableLayout.setVisibility(View.VISIBLE);
            expandState.put(i, true);
        }
    }

    //Code to rotate button
    private ObjectAnimator createRotateAnimator(final View target, final float from, final float to) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(target, "rotation", from, to);
        animator.setDuration(300);
        animator.setInterpolator(new LinearInterpolator());
        return animator;
    }
}
