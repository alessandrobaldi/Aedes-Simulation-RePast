package aedes;

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import groovy.lang.Closure;
import repast.simphony.relogo.*;
import repast.simphony.relogo.builder.GeneratedByReLogoBuilder;
import repast.simphony.relogo.builder.ReLogoBuilderGeneratedFor;

@GeneratedByReLogoBuilder
@SuppressWarnings({"unused","rawtypes","unchecked"})
public class ReLogoLink<T> extends BaseLink<T>	{

	/**
	 * Returns an agentset of agentss on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of agentss on patch p
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.Agents")
	public AgentSet<aedes.relogo.Agents> agentssOn(Patch p){
		AgentSet<aedes.relogo.Agents> result = new AgentSet<aedes.relogo.Agents>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"agents")){
			if (t instanceof aedes.relogo.Agents)
			result.add((aedes.relogo.Agents)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of agentss on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of agentss on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.Agents")
	public AgentSet<aedes.relogo.Agents> agentssOn(Turtle t){
		AgentSet<aedes.relogo.Agents> result = new AgentSet<aedes.relogo.Agents>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"agents")){
			if (tt instanceof aedes.relogo.Agents)
			result.add((aedes.relogo.Agents)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of agentss on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of agentss on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.Agents")
	public AgentSet<aedes.relogo.Agents> agentssOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<aedes.relogo.Agents>();
		}

		Set<aedes.relogo.Agents> total = new HashSet<aedes.relogo.Agents>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(agentssOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(agentssOn(p));
				}
			}
		}
		return new AgentSet<aedes.relogo.Agents>(total);
	}

	/**
	 * Queries if object is a agents.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a agents
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.Agents")
	public boolean isAgentsQ(Object o){
		return (o instanceof aedes.relogo.Agents);
	}

	/**
	 * Returns the agents with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.Agents")
	public aedes.relogo.Agents agents(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof aedes.relogo.Agents)
			return (aedes.relogo.Agents) turtle;
		return null;
	}

	/**
	 * Returns an agentset containing all agentss.
	 * 
	 * @return agentset of all agentss
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.Agents")
	public AgentSet<aedes.relogo.Agents> agentss(){
		AgentSet<aedes.relogo.Agents> a = new AgentSet<aedes.relogo.Agents>();
		for (Object e : this.getMyObserver().getContext().getObjects(aedes.relogo.Agents.class)) {
			if (e instanceof aedes.relogo.Agents){
				a.add((aedes.relogo.Agents)e);
			}
		}
		return a;
	}

	/**
	 * Returns an agentset of eggss on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of eggss on patch p
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.Eggs")
	public AgentSet<aedes.relogo.Eggs> eggssOn(Patch p){
		AgentSet<aedes.relogo.Eggs> result = new AgentSet<aedes.relogo.Eggs>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"eggs")){
			if (t instanceof aedes.relogo.Eggs)
			result.add((aedes.relogo.Eggs)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of eggss on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of eggss on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.Eggs")
	public AgentSet<aedes.relogo.Eggs> eggssOn(Turtle t){
		AgentSet<aedes.relogo.Eggs> result = new AgentSet<aedes.relogo.Eggs>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"eggs")){
			if (tt instanceof aedes.relogo.Eggs)
			result.add((aedes.relogo.Eggs)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of eggss on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of eggss on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.Eggs")
	public AgentSet<aedes.relogo.Eggs> eggssOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<aedes.relogo.Eggs>();
		}

		Set<aedes.relogo.Eggs> total = new HashSet<aedes.relogo.Eggs>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(eggssOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(eggssOn(p));
				}
			}
		}
		return new AgentSet<aedes.relogo.Eggs>(total);
	}

	/**
	 * Queries if object is a eggs.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a eggs
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.Eggs")
	public boolean isEggsQ(Object o){
		return (o instanceof aedes.relogo.Eggs);
	}

	/**
	 * Returns the eggs with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.Eggs")
	public aedes.relogo.Eggs eggs(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof aedes.relogo.Eggs)
			return (aedes.relogo.Eggs) turtle;
		return null;
	}

	/**
	 * Returns an agentset containing all eggss.
	 * 
	 * @return agentset of all eggss
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.Eggs")
	public AgentSet<aedes.relogo.Eggs> eggss(){
		AgentSet<aedes.relogo.Eggs> a = new AgentSet<aedes.relogo.Eggs>();
		for (Object e : this.getMyObserver().getContext().getObjects(aedes.relogo.Eggs.class)) {
			if (e instanceof aedes.relogo.Eggs){
				a.add((aedes.relogo.Eggs)e);
			}
		}
		return a;
	}

	/**
	 * Returns an agentset of houses on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of houses on patch p
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.House")
	public AgentSet<aedes.relogo.House> housesOn(Patch p){
		AgentSet<aedes.relogo.House> result = new AgentSet<aedes.relogo.House>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"house")){
			if (t instanceof aedes.relogo.House)
			result.add((aedes.relogo.House)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of houses on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of houses on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.House")
	public AgentSet<aedes.relogo.House> housesOn(Turtle t){
		AgentSet<aedes.relogo.House> result = new AgentSet<aedes.relogo.House>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"house")){
			if (tt instanceof aedes.relogo.House)
			result.add((aedes.relogo.House)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of houses on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of houses on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.House")
	public AgentSet<aedes.relogo.House> housesOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<aedes.relogo.House>();
		}

		Set<aedes.relogo.House> total = new HashSet<aedes.relogo.House>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(housesOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(housesOn(p));
				}
			}
		}
		return new AgentSet<aedes.relogo.House>(total);
	}

	/**
	 * Queries if object is a house.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a house
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.House")
	public boolean isHouseQ(Object o){
		return (o instanceof aedes.relogo.House);
	}

	/**
	 * Returns the house with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.House")
	public aedes.relogo.House house(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof aedes.relogo.House)
			return (aedes.relogo.House) turtle;
		return null;
	}

	/**
	 * Returns an agentset containing all houses.
	 * 
	 * @return agentset of all houses
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.House")
	public AgentSet<aedes.relogo.House> houses(){
		AgentSet<aedes.relogo.House> a = new AgentSet<aedes.relogo.House>();
		for (Object e : this.getMyObserver().getContext().getObjects(aedes.relogo.House.class)) {
			if (e instanceof aedes.relogo.House){
				a.add((aedes.relogo.House)e);
			}
		}
		return a;
	}

	/**
	 * Returns an agentset of mosquitos on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of mosquitos on patch p
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.Mosquito")
	public AgentSet<aedes.relogo.Mosquito> mosquitosOn(Patch p){
		AgentSet<aedes.relogo.Mosquito> result = new AgentSet<aedes.relogo.Mosquito>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"mosquito")){
			if (t instanceof aedes.relogo.Mosquito)
			result.add((aedes.relogo.Mosquito)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of mosquitos on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of mosquitos on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.Mosquito")
	public AgentSet<aedes.relogo.Mosquito> mosquitosOn(Turtle t){
		AgentSet<aedes.relogo.Mosquito> result = new AgentSet<aedes.relogo.Mosquito>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"mosquito")){
			if (tt instanceof aedes.relogo.Mosquito)
			result.add((aedes.relogo.Mosquito)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of mosquitos on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of mosquitos on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.Mosquito")
	public AgentSet<aedes.relogo.Mosquito> mosquitosOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<aedes.relogo.Mosquito>();
		}

		Set<aedes.relogo.Mosquito> total = new HashSet<aedes.relogo.Mosquito>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(mosquitosOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(mosquitosOn(p));
				}
			}
		}
		return new AgentSet<aedes.relogo.Mosquito>(total);
	}

	/**
	 * Queries if object is a mosquito.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a mosquito
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.Mosquito")
	public boolean isMosquitoQ(Object o){
		return (o instanceof aedes.relogo.Mosquito);
	}

	/**
	 * Returns the mosquito with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.Mosquito")
	public aedes.relogo.Mosquito mosquito(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof aedes.relogo.Mosquito)
			return (aedes.relogo.Mosquito) turtle;
		return null;
	}

	/**
	 * Returns an agentset containing all mosquitos.
	 * 
	 * @return agentset of all mosquitos
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.Mosquito")
	public AgentSet<aedes.relogo.Mosquito> mosquitos(){
		AgentSet<aedes.relogo.Mosquito> a = new AgentSet<aedes.relogo.Mosquito>();
		for (Object e : this.getMyObserver().getContext().getObjects(aedes.relogo.Mosquito.class)) {
			if (e instanceof aedes.relogo.Mosquito){
				a.add((aedes.relogo.Mosquito)e);
			}
		}
		return a;
	}

	/**
	 * Returns an agentset of userTurtles on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of userTurtles on patch p
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.UserTurtle")
	public AgentSet<aedes.relogo.UserTurtle> userTurtlesOn(Patch p){
		AgentSet<aedes.relogo.UserTurtle> result = new AgentSet<aedes.relogo.UserTurtle>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"userTurtle")){
			if (t instanceof aedes.relogo.UserTurtle)
			result.add((aedes.relogo.UserTurtle)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of userTurtles on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.UserTurtle")
	public AgentSet<aedes.relogo.UserTurtle> userTurtlesOn(Turtle t){
		AgentSet<aedes.relogo.UserTurtle> result = new AgentSet<aedes.relogo.UserTurtle>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"userTurtle")){
			if (tt instanceof aedes.relogo.UserTurtle)
			result.add((aedes.relogo.UserTurtle)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of userTurtles on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.UserTurtle")
	public AgentSet<aedes.relogo.UserTurtle> userTurtlesOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<aedes.relogo.UserTurtle>();
		}

		Set<aedes.relogo.UserTurtle> total = new HashSet<aedes.relogo.UserTurtle>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(userTurtlesOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(userTurtlesOn(p));
				}
			}
		}
		return new AgentSet<aedes.relogo.UserTurtle>(total);
	}

	/**
	 * Queries if object is a userTurtle.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userTurtle
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.UserTurtle")
	public boolean isUserTurtleQ(Object o){
		return (o instanceof aedes.relogo.UserTurtle);
	}

	/**
	 * Returns the userTurtle with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.UserTurtle")
	public aedes.relogo.UserTurtle userTurtle(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof aedes.relogo.UserTurtle)
			return (aedes.relogo.UserTurtle) turtle;
		return null;
	}

	/**
	 * Returns an agentset containing all userTurtles.
	 * 
	 * @return agentset of all userTurtles
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.UserTurtle")
	public AgentSet<aedes.relogo.UserTurtle> userTurtles(){
		AgentSet<aedes.relogo.UserTurtle> a = new AgentSet<aedes.relogo.UserTurtle>();
		for (Object e : this.getMyObserver().getContext().getObjects(aedes.relogo.UserTurtle.class)) {
			if (e instanceof aedes.relogo.UserTurtle){
				a.add((aedes.relogo.UserTurtle)e);
			}
		}
		return a;
	}

	/**
	 * Queries if object is a userLink.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userLink
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.UserLink")
	public boolean isUserLinkQ(Object o){
		return (o instanceof aedes.relogo.UserLink);
	}

	/**
	 * Returns an agentset containing all userLinks.
	 * 
	 * @return agentset of all userLinks
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.UserLink")
	public AgentSet<aedes.relogo.UserLink> userLinks(){
		AgentSet<aedes.relogo.UserLink> a = new AgentSet<aedes.relogo.UserLink>();
		for (Object e : this.getMyObserver().getContext().getObjects(aedes.relogo.UserLink.class)) {
			if (e instanceof aedes.relogo.UserLink){
				a.add((aedes.relogo.UserLink)e);
			}
		}
		return a;
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            an integer
	 * @param otherEnd
	 *            an integer
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.UserLink")
	public aedes.relogo.UserLink userLink(Number oneEnd, Number otherEnd) {
		return (aedes.relogo.UserLink)(this.getMyObserver().getNetwork("UserLink").getEdge(turtle(oneEnd),turtle(otherEnd)));
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            a turtle
	 * @param otherEnd
	 *            a turtle
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("aedes.relogo.UserLink")
	public aedes.relogo.UserLink userLink(Turtle oneEnd, Turtle otherEnd) {
		return userLink(oneEnd.getWho(), otherEnd.getWho());
	}

	/**
	 * Returns the value of the global variable numHouses.
	 *
	 * @return the value of the global variable numHouses
	 */
	@ReLogoBuilderGeneratedFor("global: numHouses")
	public Object getNumHouses(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numHouses");
	}

	/**
	 * Sets the value of the global variable numHouses.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numHouses")
	public void setNumHouses(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numHouses",value);
	}

	/**
	 * Returns the value of the global variable numMosquitos.
	 *
	 * @return the value of the global variable numMosquitos
	 */
	@ReLogoBuilderGeneratedFor("global: numMosquitos")
	public Object getNumMosquitos(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numMosquitos");
	}

	/**
	 * Sets the value of the global variable numMosquitos.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numMosquitos")
	public void setNumMosquitos(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numMosquitos",value);
	}


}