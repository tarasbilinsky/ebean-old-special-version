package com.avaje.ebeaninternal.server.deploy;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Determine the Many Type for a property.
 * <p>
 * Scala types require CollectionTypeConverter's to wrap and unwrap from the
 * underlying java types used.
 * </p>
 */
public class DetermineManyType {

    private final boolean withScalaSupport;
    private final ManyType scalaBufMany;
    private final ManyType scalaSetMany;
    private final ManyType scalaMapMany;
    
    public DetermineManyType(boolean withScalaSupport) {
        this.withScalaSupport = withScalaSupport;
        if (withScalaSupport){
            
        	throw new RuntimeException("EBEAN Removed Code!");
            
            
        } else {
            this.scalaBufMany = null;
            this.scalaSetMany = null;
            this.scalaMapMany = null;
        }
    }
    
	public ManyType getManyType(Class<?> type) {
        if (type.equals(List.class)){
        	return ManyType.JAVA_LIST;
        }
        if (type.equals(Set.class)){
        	return ManyType.JAVA_SET;
        } 
        if (type.equals(Map.class)){
        	return ManyType.JAVA_MAP;
        }
        if (withScalaSupport){
        	throw new RuntimeException("EBEAN Removed Code!");
        }
        return null;
    }
}
