package com.nytimes.android.external.register.legal;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.nytimes.android.external.register.R;

import java.util.Map;

/**
 * it shows the license holder and license value
 */
public class LegalViewHolder extends RecyclerView.ViewHolder {

    @NonNull
    private final TextView title;
    @NonNull
    private final TextView body;

    public LegalViewHolder(@NonNull View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.legal_item_title);
        body = (TextView) itemView.findViewById(R.id.legal_item_body);
    }

    public void onBind(@NonNull Map.Entry<String, String> legalText) {
        title.setText(legalText.getKey());
        body.setText(legalText.getValue());
    }
}
