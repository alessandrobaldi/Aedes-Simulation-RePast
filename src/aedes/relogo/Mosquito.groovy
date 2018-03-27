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

class Mosquito extends ReLogoTurtle {
	def days = 0
	//def houseshere = housesHere()
	def x = this.getXcor()
	def y= this.getYcor()
	def housecanfly
	def step(){
		//choose another house and lay eggs if mosquito has less than 38 days.
		housecanfly = maxOneOf(inRadius(houses(), 100)){
			count(inRadius(houses(), 100))
		}
		while(housecanfly.distancexy(x, y)>100)
		{
			housecanfly = maxOneOf(inRadius(houses(), 100)){
				count(inRadius(houses(), 100))
			}
		}
		if(days<38)
		{
			face(housecanfly)
			moveTo(housecanfly)
			days++
			if(housecanfly.activefocus==true)
			{
				hatchEggss(1)
			}
			if(housecanfly.trap==true)
			{
				die()
			}
		}
		else
		{
			die()
		}
	}
}
