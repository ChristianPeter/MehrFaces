/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol.korra.jsf.mehrfaces.components;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import javax.el.MethodExpression;
import javax.faces.component.FacesComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.FacesEvent;

/**
 *
 * @author debiandev
 */
@FacesComponent(createTag = true, tagName = "autocomplete")
public class Autocomplete extends HtmlInputText {

    private static final Collection<String> EVENT_NAMES = Collections.unmodifiableCollection(Arrays.asList("blur", "change", "valueChange", "click", "dblclick", "focus", "keydown", "keypress", "keyup", "mousedown", "mousemove", "mouseout", "mouseover", "mouseup", "select", "itemSelect", "itemUnselect", "query"));

    protected enum PropertyKeys {

        placeholder, widgetVar, completeMethod, var, itemLabel, itemValue, maxResults, minQueryLength, queryDelay, queryDeletionDelay, forceSelection, scrollHeight, effect, effectDuration, dropdown, panelStyle, panelStyleClass, multiple, itemtipMyPosition, itemtipAtPosition, cache, cacheTimeout, emptyMessage, appendTo, resultsMessage, groupBy;

        String toString;

        PropertyKeys(String toString) {
            this.toString = toString;
        }

        PropertyKeys() {
        }

        public String toString() {
            return ((this.toString != null) ? this.toString : super.toString());
        }
    }

    @Override
    public String getFamily() {
        return "sol.java.jsftutorial.uicomponent";
    }

    @Override
    public String getRendererType() {
        return "myautocomplete.renderer";
    }

    @Override
    public Collection<String> getEventNames() {
        return EVENT_NAMES;
    }

    public javax.el.MethodExpression getCompleteMethod() {
        return (javax.el.MethodExpression) getStateHelper().eval(PropertyKeys.completeMethod, null);
    }

    public void setCompleteMethod(javax.el.MethodExpression _completeMethod) {
        getStateHelper().put(PropertyKeys.completeMethod, _completeMethod);
    }

    @Override
    public void broadcast(FacesEvent event) throws AbortProcessingException {

        super.broadcast(event); //To change body of generated methods, choose Tools | Templates.

        FacesContext ctx = getFacesContext();
        MethodExpression me = getCompleteMethod();
        System.out.println("Broadcast");
        System.out.println("me " + me);
        if (me != null && event instanceof AutocompleteEvent){
            System.out.println("we have an event");
        }

    }

    @Override
    public void queueEvent(FacesEvent event) {
        System.out.println("queue event " + event);
        super.queueEvent(event); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
