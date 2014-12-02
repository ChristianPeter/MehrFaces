/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sol.korra.jsf.mehrfaces.components;

import javax.faces.component.UIComponent;
import javax.faces.event.FacesEvent;
import javax.faces.event.FacesListener;

/**
 *
 * @author debiandev
 */
public class AutocompleteEvent extends FacesEvent{
    
    private String query;
    
    public AutocompleteEvent(UIComponent component, String query){
        super(component);
        this.query = query;
    }
    @Override
    public boolean isAppropriateListener(FacesListener fl) {
        return false;
    }

    @Override
    public void processListener(FacesListener fl) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getQuery() {
        return query;
    }
}
