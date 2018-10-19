package com.camavilca.orlando.camavilca.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.camavilca.orlando.camavilca.models.Empresa;
import com.camavilca.orlando.camavilca.repositories.EmpresaRepository;
import com.camavilca.orlando.camavilca.R;
import com.camavilca.orlando.camavilca.adapters.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class EmpresaActivity extends AppCompatActivity {

    private RecyclerView recyclerViewEmpresa;
    private RecyclerViewAdapter adaptadorEmpresa;
    Button btn_atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresa);
        recyclerViewEmpresa = (RecyclerView) findViewById(R.id.recyclerEmpresa);
        recyclerViewEmpresa.setLayoutManager(new LinearLayoutManager(this));
        String busqueda = this.getIntent().getExtras().getString("rubro");
        EmpresaRepository empRepo = EmpresaRepository.getInstance();
        btn_atras = (Button)findViewById(R.id.btn_atras);

        List<Empresa> empresas = empRepo.getEmpresas();
        //RecyclerViewAdapter adapter = new RecyclerViewAdapter();
        adaptadorEmpresa = new RecyclerViewAdapter(filtroEmpresas(empresas, busqueda));
        recyclerViewEmpresa.setAdapter(adaptadorEmpresa);
    }

    private List<Empresa> filtroEmpresas(List<Empresa> emp, String rubro) {
        List<Empresa> filtroEmpresas = new ArrayList<>();
        for (Empresa empresa : emp){
            if (empresa.getRubro().equals(rubro)){
                filtroEmpresas.add(empresa);
            }
        }
        return filtroEmpresas;
    }

    public void btnAtras(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
