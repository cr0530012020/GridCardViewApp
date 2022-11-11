package com.example.gridcardviewapp2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AdaptadorModificado(
    var imagenLista:ArrayList<ImgItems>,
    var context: Context
): BaseAdapter() {
    override fun getCount(): Int {
        return imagenLista.size
    }

    override fun getItem(position: Int): Any {
        return imagenLista[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var vista = convertView
        if(vista==null){
            vista = LayoutInflater.from(context).inflate(R.layout.fila_items,parent,false)
        }
        var imagenVista: ImageView = vista!!.findViewById(R.id.iv_Nombre)
        var tvnombre: TextView = vista!!.findViewById(R.id.tv_Nombre2)
        var tvdepartamento: TextView = vista!!.findViewById(R.id.tv_Departamento)

        val imgItems = imagenLista[position]
        imagenVista.setImageResource(imgItems.imagen)
        tvnombre.text = imgItems.nombre
        tvdepartamento.text = imgItems.departamento
        return vista!!
    }

}