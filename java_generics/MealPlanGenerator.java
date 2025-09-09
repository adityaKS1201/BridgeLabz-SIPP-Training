interface MealPlan { String getPlan(); }

class VegetarianMeal implements MealPlan {
    public String getPlan() { return "Vegetarian Meal"; }
}

class VeganMeal implements MealPlan {
    public String getPlan() { return "Vegan Meal"; }
}

class KetoMeal implements MealPlan {
    public String getPlan() { return "Keto Meal"; }
}

class HighProteinMeal implements MealPlan {
    public String getPlan() { return "High Protein Meal"; }
}

class Meal<T extends MealPlan> {
    private T meal;
    public Meal(T meal) { this.meal = meal; }
    public T getMeal() { return meal; }
}

public class MealPlanGenerator {
    public static <T extends MealPlan> void generateMealPlan(Meal<T> meal) {
        System.out.println("Generated Plan: " + meal.getMeal().getPlan());
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());

        generateMealPlan(vegMeal);
        generateMealPlan(veganMeal);
    }
}
