package com.dickinson.program;

public class Ingredient extends item {
private String unitSize;
private double calories;
private double fat;
private double protein;
private double carbs;

public Ingredient(String u,double cal, double f, double p, double car)
{
	setUnitSize(u);
	setCalories(cal);
	setFat(f);
	setProtein(p);
	setCarbs(car);
}
String getUnitsize(){	
	return unitSize;
}
void setUnitSize(String unitSize) {
	this.unitSize = unitSize;
}
double getCalories() {
	return calories;
}
void setCalories(double calories) {
	this.calories = calories;
}
double getFat() {
	return fat;
}
void setFat(double fat) {
	this.fat = fat;
}
double getProtein() {
	return protein;
}
void setProtein(double protein) {
	this.protein = protein;
}
double getCarbs() {
	return carbs;
}
void setCarbs(double carbs) {
	this.carbs = carbs;
}


}
