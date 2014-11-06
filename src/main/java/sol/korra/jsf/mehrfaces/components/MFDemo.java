/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol.korra.jsf.mehrfaces.components;

import java.io.IOException;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

/**
 *
 * @author debiandev
 */
public class MFDemo extends UIComponentBase {

    @Override
    public String getFamily() {
        return "sol.korra.jsf.mehrfaces";
    }
    
    @Override
    public void encodeBegin(FacesContext context) throws IOException {
        final ResponseWriter writer = context.getResponseWriter();
        writer.append("<h1 style='color:red;'>");
        super.encodeBegin(context);
    }

    @Override
    public void encodeEnd(FacesContext context) throws IOException {
        super.encodeEnd(context);
        final ResponseWriter writer = context.getResponseWriter();
        writer.append("</h1>");
    }

}
