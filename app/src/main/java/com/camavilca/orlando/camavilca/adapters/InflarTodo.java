package com.camavilca.orlando.camavilca.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.camavilca.orlando.camavilca.R;
import com.camavilca.orlando.camavilca.models.Empresa;

import java.util.List;

public class InflarTodo extends RecyclerView.Adapter<InflarTodo.ViewHolder> {

    private List<Empresa> empresas;

    public InflarTodo(List<Empresa> empresas) {
        this.empresas = empresas;
    }

    public void setEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return empresas.size();
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
