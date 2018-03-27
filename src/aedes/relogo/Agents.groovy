package aedes.relogo

import static repast.simphony.relogo.Utility.*
import static repast.simphony.relogo.UtilityG.*

import java.util.concurrent.ScheduledFuture

import javax.help.plaf.basic.BasicFavoritesNavigatorUI.RemoveAction

import aedes.ReLogoTurtle
import repast.simphony.relogo.Plural
import repast.simphony.relogo.Stop
import repast.simphony.relogo.Utility
import repast.simphony.relogo.UtilityG
import repast.simphony.relogo.schedule.Go
import repast.simphony.relogo.schedule.Setup

class Agents extends ReLogoTurtle {
	def step(){
		def calling = 0
		calling++
		if(calling==4)
		{
			def counting = 3
			while(counting>0)
			{
			def houseat = oneOf(housesHere())
			desinfect(houseat)
			mosquitosHere().removeAll()
			eggssHere().removeAll()
			def next = maxOneOf(neighbors()){
				count(housesOn(it))
			}
			moveTo(next)
			counting--
			}
			die()
		}
	}
	
	def desinfect(House){
		House.activefocus=false
	}
}
