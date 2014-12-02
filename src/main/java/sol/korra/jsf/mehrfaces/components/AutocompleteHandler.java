/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sol.korra.jsf.mehrfaces.components;

import com.sun.faces.facelets.tag.MethodRule;
import java.util.List;
import javax.faces.view.facelets.ComponentConfig;
import javax.faces.view.facelets.ComponentHandler;
import javax.faces.view.facelets.MetaRule;
import javax.faces.view.facelets.MetaRuleset;

/**
 *
 * @author debiandev
 */
public class AutocompleteHandler extends ComponentHandler {

	private static final MetaRule COMPLETE_METHOD =
			new MethodRule("completeMethod", List.class, new Class[]{String.class});

	public AutocompleteHandler(ComponentConfig config) {
		super(config);
                System.out.println("Component Handler!!");
	}
	
	@SuppressWarnings("unchecked")
	protected MetaRuleset createMetaRuleset(Class type) { 
                System.out.println("Component Handler!!222");
		MetaRuleset metaRuleset = super.createMetaRuleset(type); 
		
		metaRuleset.addRule(COMPLETE_METHOD);
		
		return metaRuleset; 
	} 
}