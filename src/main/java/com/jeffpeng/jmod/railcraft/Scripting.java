package com.jeffpeng.jmod.railcraft;

import java.util.List;

import com.jeffpeng.jmod.JMODRepresentation;
import com.jeffpeng.jmod.primitives.ModScriptObject;
import com.jeffpeng.jmod.primitives.OwnedObject;
import com.jeffpeng.jmod.railcraft.actions.AddRollingMachineRecipe;
import com.jeffpeng.jmod.railcraft.actions.RemoveRollingMachineRecipe;

public class Scripting extends ModScriptObject {

	public Scripting(JMODRepresentation owner) {
		super(owner);
	}
	
	public void addRollingMachineRecipe(String outputItemStr, List<String[]> shape) {
		if(owner.testForMod("Railcraft")) new AddRollingMachineRecipe(owner, outputItemStr, shape);
	}
	
	public void removeRollingMachineRecipe(String outputItemStr) {
		if(owner.testForMod("Railcraft")) new RemoveRollingMachineRecipe(owner, outputItemStr);
	}

}
