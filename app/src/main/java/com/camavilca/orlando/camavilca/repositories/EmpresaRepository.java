package com.camavilca.orlando.camavilca.repositories;

import com.camavilca.orlando.camavilca.R;
import com.camavilca.orlando.camavilca.models.Empresa;

import java.util.ArrayList;
import java.util.List;

public class EmpresaRepository {
    private static EmpresaRepository _INSTANCE = null;

    private EmpresaRepository(){}

    public static EmpresaRepository getInstance(){
        if (_INSTANCE == null)
            _INSTANCE = new EmpresaRepository();
        return _INSTANCE;
    }
    private List<Empresa> empresas = new ArrayList<>();
    public List<Empresa> getEmpresas() {
        empresas.add(new Empresa(1,"Restaurante","Paparazzi","Mz.I Lt 1 Gr Sc.2 Ventanilla - Lima - Lima",
                "+34 928380948", "forkroad@gmail.com", "www.forkroad.com", R.drawable.f1, "La mejor comida"));

        empresas.add(new Empresa(2,"Restaurante","Sabor y Sazón","Mz.L Lt 27 Pachacutec 1º Etapa - Giron Camana",
                "(01) 293 3868", "saborysazon@gmail.com", "www.saborysazon.com", R.drawable.f2, "Sazón"));

        empresas.add(new Empresa(3,"Banco","Banco BCP","Av. Peru s/n, Plz. Barrios Altos-Riva Aguero",
                "(01) 2879546", "bancobcp@gmail.com", "www.bancobcp.com", R.drawable.f3, "Tu banco de confianza"));

        empresas.add(new Empresa(4,"Banco","Azteca","San Juan de Lurigancho 3 etapa 97987",
                "(01) 3119000", "Azteca@banca.pe", "www.Azteca.pe", R.drawable.f4, "El banco que necesitas"));

        empresas.add(new Empresa(5,"Hotel","Belmond","San Miguel 1213 - Lima",
                "(01) 2177000", "Belmond@hotel.com", "http://www.Belmond.com", R.drawable.f5, "Encuentre su mejor lugar de descanso"));

        empresas.add(new Empresa(6,"Hotel","CasaAndina","Santiago de Surco - Lima",
                "(01) 2061100", "CasaAndina@hotel.com", "http://www.CasaAndina.com", R.drawable.f7, "El mejor lugar con el menor costo"));
        empresas.add(new Empresa(7,"Hotel","A una Luca","Ate",
                "(01) 928260591", "hotel.lucho@hotel.com", "http://www.Manito.com", R.drawable.f7, "El mejor lugar con el menor costo"));

        return empresas;
    }
}
