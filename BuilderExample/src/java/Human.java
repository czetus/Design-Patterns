
class Human implements HumanPlan
{
    private String hBrain;
    private String hColorOfEyes;
    private Double height;
    private String name;
    private Double weight;





        @Override
	public void setBrain(String brain) { this.hBrain = brain;}
	@Override
	public void setColorOfEyes(String colorOfEyes) { this.hColorOfEyes = colorOfEyes;}

	/**
	 * @return the hBrain
	 */
	public String gethBrain() {
		return hBrain;
	}

	/**
	 * @return the hColorOfEyes
	 */
	public String gethColorOfEyes() {
		return hColorOfEyes;
	}

	/**
	 * @return the height
	 */
	public Double getHeight() {
		return height;
	}

	@Override
	public void setHeight(Double height){ this.height = height;}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name){ this.name = name;}

	/**
	 * @return the weight
	 */
	public Double getWeight() {
		return weight;
	}

	@Override
	public void setWeight(Double weight) {this.weight = weight;}

}

