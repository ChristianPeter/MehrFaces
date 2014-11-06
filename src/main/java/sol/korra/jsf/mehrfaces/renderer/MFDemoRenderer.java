/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sol.korra.jsf.mehrfaces.renderer;

import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.render.Renderer;

/**
 *
 * @author debiandev
 */
public class MFDemoRenderer extends Renderer{

    @Override
    public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
        super.encodeBegin(context, component); //To change body of generated methods, choose Tools | Templates.
        System.out.println("BEGIN");
    }

    @Override
    public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
        super.encodeEnd(context, component); //To change body of generated methods, choose Tools | Templates.
        System.out.println("END");
    }
    
}
