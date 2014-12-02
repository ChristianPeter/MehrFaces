/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sol.korra.jsf.mehrfaces.renderer;

import com.sun.faces.renderkit.html_basic.TextRenderer;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;
import javax.faces.render.FacesRenderer;
import sol.korra.jsf.mehrfaces.components.Autocomplete;
import sol.korra.jsf.mehrfaces.components.AutocompleteEvent;


/**
 *
 * @author debiandev
 */
@FacesRenderer(rendererType = "myautocomplete.renderer", componentFamily = "sol.java.jsftutorial.uicomponent")
public class AutocompleteRenderer extends TextRenderer{

    @Override
    public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
        super.encodeBegin(context, component); //To change body of generated methods, choose Tools | Templates.
        System.out.println("TESTTESTTEST");
    }

    @Override
    public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
        super.encodeEnd(context, component); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void decode(FacesContext context, UIComponent component) {
        
        Autocomplete ac = (Autocomplete) component;
        String clientId = ac.getClientId(context);
        Map<String, String> params = context.getExternalContext().getRequestParameterMap();
        
        if(ac.isDisabled() || ac.isReadonly()) {
            return;
        }
        
        for (Entry<String,String> e : params.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
        AutocompleteEvent evt = new AutocompleteEvent(ac, "hello world");
        evt.setPhaseId(PhaseId.APPLY_REQUEST_VALUES);
        ac.queueEvent(evt);
        
        
    }
    
    
    
    
    
}
