package aedes.relogo

import static repast.simphony.relogo.Utility.*
import static repast.simphony.relogo.UtilityG.*

import aedes.ReLogoTurtle
import repast.simphony.relogo.Plural
import repast.simphony.relogo.Stop
import repast.simphony.relogo.Utility
import repast.simphony.relogo.UtilityG
import repast.simphony.relogo.schedule.Go
import repast.simphony.relogo.schedule.Setup

class Eggs extends ReLogoTurtle {
	def days=0
	def step(){
		days++
		if(days==20) {
			hatchMosquitos(10)//10 mosquitos born after 20 days
			die()
		}
	}
}
