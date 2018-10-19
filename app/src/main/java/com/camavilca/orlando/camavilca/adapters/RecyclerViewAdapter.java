package com.camavilca.orlando.camavilca.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.camavilca.orlando.camavilca.models.Empresa;
import com.camavilca.orlando.camavilca.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    public List<Empresa> listaEmpresas;
    public RecyclerViewAdapter(List<Empresa> listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.i_emp, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        holder.nombre.setText(listaEmpresas.get(position).getNombre());
        holder.direccion.setText(listaEmpresas.get(position).getDireccion());
        holder.telefono.setText(listaEmpresas.get(position).getTelefono());
        holder.logoEmpresa.setImageResource(listaEmpresas.get(position).getLogo());
    }

    @Override
    public int getItemCount() {
        return listaEmpresas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nombre, direccion, telefono;
        private ImageView logoEmpresa;

        public ViewHolder(View itemView) {
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.tvNombre);
            direccion = (TextView) itemView.findViewById(R.id.tvDireccion);
            telefono = (TextView) itemView.findViewById(R.id.tvTelefono);
            logoEmpresa = (ImageView) itemView.findViewById(R.id.imgEmpresa);
        }
    }

}
