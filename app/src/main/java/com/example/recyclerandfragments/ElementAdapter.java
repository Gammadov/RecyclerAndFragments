package com.example.recyclerandfragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ElementAdapter extends RecyclerView.Adapter<ElementAdapter.ViewHolder> {

    private final LayoutInflater layoutInflaterinflater;
    private final List<Element> elementList;

    public ElementAdapter(Context context, List<Element> elementList) {
        this.layoutInflaterinflater = LayoutInflater.from(context);
        this.elementList = elementList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflaterinflater.inflate(R.layout.element, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ElementAdapter.ViewHolder holder, int position) {
        Element singleElement = elementList.get(position);
        holder.txt.setText(singleElement.getTxt());
        holder.img.setImageResource(singleElement.getId());
    }

    @Override
    public int getItemCount() {
        return elementList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final TextView txt;
        final ImageView img;

        public ViewHolder(View itemView) {
            super(itemView);
            txt = (TextView) itemView.findViewById(R.id.textView);
            img = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}
