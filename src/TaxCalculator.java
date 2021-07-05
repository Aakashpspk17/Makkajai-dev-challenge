package com.decorator;

public abstract class Taxcaluculator implements Item{

protected Item item;

protected double rate;

abstract double getRate();

public Taxcaluculator(Item item){
this.item = item;
}

public double getPrice(){
	double salesTax = Util.nearest5Percent(this.item.getInitPrice() * this.getRate());
	return Util.roundPrice(this.item.getPrice() + salesTax);
}

}