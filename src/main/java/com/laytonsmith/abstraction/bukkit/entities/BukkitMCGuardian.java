package com.laytonsmith.abstraction.bukkit.entities;

import com.laytonsmith.abstraction.entities.MCGuardian;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Guardian;

public class BukkitMCGuardian extends BukkitMCLivingEntity implements MCGuardian {

	Guardian e;

	public BukkitMCGuardian(Entity ent) {
		super(ent);
		e = (Guardian) ent;
	}
}
