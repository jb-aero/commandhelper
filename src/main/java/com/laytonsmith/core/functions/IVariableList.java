/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laytonsmith.core.functions;

import com.laytonsmith.core.constructs.IVariable;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Layton
 */
public class IVariableList {
    Map<String, IVariable> varList = new HashMap<String, IVariable>();
    
    public void set(IVariable v){
        varList.put(v.getName(), v);
    }
    
    public IVariable get(String name, int line_num, File f){
        if(!varList.containsKey(name)){
            this.set(new IVariable(name, line_num, f));
        }
        return varList.get(name);
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("[");
        boolean first = true;
        for(Map.Entry<String, IVariable> entry : varList.entrySet()){
            IVariable iv = entry.getValue();
            if(first){
                first = false;
            } else {
                b.append(", ");
            }
            b.append(iv.getName()).append(":").append("(").append(iv.ival().getClass().getSimpleName()).append(")").append(iv.ival().val());
        }
        b.append("]");
        return b.toString();
    }
    
    @Override
    public IVariableList clone(){
        IVariableList clone = new IVariableList();
        clone.varList = new HashMap<String, IVariable>(varList);
        return clone;
    }

    //package private, only the reflection package should be accessing this anyways
    Set<String> keySet() {
        return varList.keySet();
    }
    
    
}
