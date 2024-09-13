package co.edu.uniquindio.services;

import co.edu.uniquindio.model.ArticuloCientifico;

import java.util.List;

public interface ICrudArticuloCientifico {
    public boolean crearArticuloCientifico(String idArticuloCientifico, String editorial, int numeroPaginas, boolean estado, String descripcion);
    public boolean eliminarArticuloCientifico(String idArticuloCientifico);
    public boolean modificarArticuloCientifico(String idArticuloCientifico, String editorial, int numeroPaginas);
    public ArticuloCientifico getArticuloCientifico(String idArticuloCientifico);
    public List <ArticuloCientifico> listarArticuloCientifico();

}
