package co.edu.uniquindio.model;

import co.edu.uniquindio.model.builder.ArticuloCientificoBuilder;
import co.edu.uniquindio.model.builder.MiembroBuilder;

public class ArticuloCientifico {

    protected String idArticuloCientifico;
    protected String editorial;
    protected int numeroPaginas;
    protected boolean estado;
    protected String descripcion;

    public ArticuloCientifico(String idArticuloCientifico, String editorial, int numeroPaginas, boolean estado, String descripcion) {
        this.idArticuloCientifico = idArticuloCientifico;
        this.editorial = editorial;
        this.numeroPaginas = numeroPaginas;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public static ArticuloCientificoBuilder builder(){
        return new ArticuloCientificoBuilder();
    public String getIdArticuloCientifico() {return IdArticuloCientifico;}
    public String getEditorial() { return editorial;}
    public int getNumeroPaginas() {return numeroPaginas}
        public boolean isEstado() {return estado}
         public String getDescripcion() {return descripcion;
         }
}
