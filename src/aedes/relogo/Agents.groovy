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
	def calling = 0
	def step(){
		calling++
		if(calling==3)
		{
			def counting = 5
			agentssHere().removeAll()
			while(counting>0)//visiting houses and removing eggs/mosquitos/foci
			{
			def houseat = oneOf(housesHere())
			if(houseat!=null)
			{
			desinfect(houseat)
			}
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
