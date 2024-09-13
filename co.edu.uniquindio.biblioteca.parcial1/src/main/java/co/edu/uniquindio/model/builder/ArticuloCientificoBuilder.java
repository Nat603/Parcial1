package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.ArticuloCientifico;

public class ArticuloCientificoBuilder {
    protected String idArticuloCientifico;
    protected String editorial;
    protected int numeroPaginas;
    protected boolean estado;
    protected String descripcion;

    public ArticuloCientificoBuilder() {return new ArticuloCientifico ( idArticuloCientifico, editorial,numeroPaginas,estado,descripcion);

        public ArticuloCientificoBuilder idArticuloCientifico(String idArticuloCientifico){
            this.idArticuloCientifico= idArticuloCientifico;
            return this;
        }
        public ArticuloCientificoBuilder editorial(String editorial){
            this.editorial= editorial;
            return this;
        }
        public ArticuloCientificoBuilder numeroPaginas(int numeroPaginas){
            this.numeroPaginas= numeroPaginas;
            return this;
        }
        public ArticuloCientificoBuilder estado(String estado){
            this.estado= estado;
            return this;
        }
    }
}
