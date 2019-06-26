/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavens.rules;

import java.util.List;
import javax.ejb.Local;
import mavens.libreria.Editoriales;

/**
 *
 * @author Ferna
 */
@Local
public interface EditorialesFacadeLocal {

    void create(Editoriales editoriales);

    void edit(Editoriales editoriales);

    void remove(Editoriales editoriales);

    Editoriales find(Object id);

    List<Editoriales> findAll();

    List<Editoriales> findRange(int[] range);

    int count();
    
}
