package com.laytonsmith.abstraction.entities;

import com.laytonsmith.abstraction.MCEntity;
import com.laytonsmith.abstraction.blocks.MCMaterial;

public interface MCFallingBlock extends MCEntity {
	boolean getDropItem();
	MCMaterial getMaterial();
	void setDropItem(boolean drop);
	boolean canHurtEntities();
	void setHurtEntities(boolean hurt);
}
