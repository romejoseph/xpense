package com.rjrs.xpense.config;

import com.rjrs.xpense.entity.Expense;
import com.rjrs.xpense.entity.ExpenseCategory;
import com.rjrs.xpense.repository.ExpenseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@Configuration
class SeedConfig {
    private final Random random = new Random();
    private int expenseCounter = 0;

    @Bean
    CommandLineRunner seed(ExpenseRepository repository) {
        return args -> repository.saveAll(getSeedExpenses());
    }

    private List<Expense> getSeedExpenses() {
        return List.of(
            new Expense("Jollibee", BigDecimal.valueOf(300), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("McDonald's", BigDecimal.valueOf(250), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("KFC", BigDecimal.valueOf(350), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Chowking", BigDecimal.valueOf(280), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Mang Inasal", BigDecimal.valueOf(200), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Greenwich", BigDecimal.valueOf(320), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Shakey's", BigDecimal.valueOf(380), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Red Ribbon Bakery", BigDecimal.valueOf(150), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Bonchon Chicken", BigDecimal.valueOf(400), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Gerry's Grill", BigDecimal.valueOf(450), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Andok's", BigDecimal.valueOf(280), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Ministop Takeout", BigDecimal.valueOf(200), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("7-Eleven Meal", BigDecimal.valueOf(180), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Family Mart Lunch", BigDecimal.valueOf(190), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Batil Patung", BigDecimal.valueOf(350), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Starbucks Coffee", BigDecimal.valueOf(200), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Coffee Bean & Tea Leaf", BigDecimal.valueOf(250), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Coco Martin Milk Tea", BigDecimal.valueOf(120), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Gong Cha Tea", BigDecimal.valueOf(130), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Tiger Sugar Boba", BigDecimal.valueOf(150), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Mister Donut Coffee", BigDecimal.valueOf(180), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Juan de la Cruz Coffee", BigDecimal.valueOf(160), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Kopiko Bottled Coffee", BigDecimal.valueOf(80), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Iced Tea Drink", BigDecimal.valueOf(60), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Juice Bar Smoothie", BigDecimal.valueOf(140), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("SM Supermarket", BigDecimal.valueOf(2500), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Puregold Groceries", BigDecimal.valueOf(2200), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Robinsons Supermarket", BigDecimal.valueOf(3000), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Savemore Groceries", BigDecimal.valueOf(1800), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Waltermart", BigDecimal.valueOf(2100), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Aling Connie's Store", BigDecimal.valueOf(1500), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Seafood Market", BigDecimal.valueOf(1200), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Wet Market Fruits", BigDecimal.valueOf(800), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Wet Market Vegetables", BigDecimal.valueOf(600), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Meat Stall", BigDecimal.valueOf(1000), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Grab Ride", BigDecimal.valueOf(150), ExpenseCategory.TRANSPORTATION, getRandomDate()),
            new Expense("Uber Trip", BigDecimal.valueOf(180), ExpenseCategory.TRANSPORTATION, getRandomDate()),
            new Expense("MRT Pass Card Load", BigDecimal.valueOf(300), ExpenseCategory.TRANSPORTATION, getRandomDate()),
            new Expense("Bus Fare", BigDecimal.valueOf(50), ExpenseCategory.TRANSPORTATION, getRandomDate()),
            new Expense("Jeepney Ride", BigDecimal.valueOf(30), ExpenseCategory.TRANSPORTATION, getRandomDate()),
            new Expense("Tricycle Ride", BigDecimal.valueOf(40), ExpenseCategory.TRANSPORTATION, getRandomDate()),
            new Expense("Taxi Fare", BigDecimal.valueOf(120), ExpenseCategory.TRANSPORTATION, getRandomDate()),
            new Expense("Fuel Gasoline", BigDecimal.valueOf(2000), ExpenseCategory.TRANSPORTATION, getRandomDate()),
            new Expense("Motorcycle Repair", BigDecimal.valueOf(800), ExpenseCategory.TRANSPORTATION, getRandomDate()),
            new Expense("Car Insurance", BigDecimal.valueOf(5000), ExpenseCategory.TRANSPORTATION, getRandomDate()),
            new Expense("SM Cinema Ticket", BigDecimal.valueOf(250), ExpenseCategory.ENTERTAINMENT, getRandomDate()),
            new Expense("Robinsons Cinema Ticket", BigDecimal.valueOf(250), ExpenseCategory.ENTERTAINMENT, getRandomDate()),
            new Expense("Karaoke Night", BigDecimal.valueOf(500), ExpenseCategory.ENTERTAINMENT, getRandomDate()),
            new Expense("Billiards Game", BigDecimal.valueOf(200), ExpenseCategory.ENTERTAINMENT, getRandomDate()),
            new Expense("Bowling Alley", BigDecimal.valueOf(300), ExpenseCategory.ENTERTAINMENT, getRandomDate()),
            new Expense("Internet Cafe Gaming", BigDecimal.valueOf(100), ExpenseCategory.ENTERTAINMENT, getRandomDate()),
            new Expense("GYM Membership", BigDecimal.valueOf(2000), ExpenseCategory.ENTERTAINMENT, getRandomDate()),
            new Expense("Basketball Court Rental", BigDecimal.valueOf(400), ExpenseCategory.ENTERTAINMENT, getRandomDate()),
            new Expense("Casino Night Out", BigDecimal.valueOf(1000), ExpenseCategory.ENTERTAINMENT, getRandomDate()),
            new Expense("Concert Tickets", BigDecimal.valueOf(1500), ExpenseCategory.ENTERTAINMENT, getRandomDate()),
            new Expense("SM Mall Apparel", BigDecimal.valueOf(2000), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Divisoria Clothes", BigDecimal.valueOf(800), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Bench Clothing", BigDecimal.valueOf(1500), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Mango Outfit", BigDecimal.valueOf(1800), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Zara Purchase", BigDecimal.valueOf(3000), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("H&M Shopping", BigDecimal.valueOf(2500), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Bershka Clothes", BigDecimal.valueOf(2200), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Uniqlo T-Shirt", BigDecimal.valueOf(800), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Payless Shoes", BigDecimal.valueOf(1500), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Nike Shoes", BigDecimal.valueOf(3500), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Lazada Phone Purchase", BigDecimal.valueOf(15000), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Shopee Smartphone Accessory", BigDecimal.valueOf(1200), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Bluetooth Speaker", BigDecimal.valueOf(2000), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Earphone Replacement", BigDecimal.valueOf(800), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("USB Power Bank", BigDecimal.valueOf(600), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Phone Screen Protector", BigDecimal.valueOf(200), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Laptop Charger", BigDecimal.valueOf(1500), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Smart Watch", BigDecimal.valueOf(5000), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Digital Camera", BigDecimal.valueOf(12000), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("LED Monitor", BigDecimal.valueOf(8000), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Electric Bill", BigDecimal.valueOf(3000), ExpenseCategory.UTILITIES, getRandomDate()),
            new Expense("Water Bill", BigDecimal.valueOf(800), ExpenseCategory.UTILITIES, getRandomDate()),
            new Expense("Internet Bill", BigDecimal.valueOf(1500), ExpenseCategory.UTILITIES, getRandomDate()),
            new Expense("Mobile Phone Bill", BigDecimal.valueOf(500), ExpenseCategory.UTILITIES, getRandomDate()),
            new Expense("Globe Postpaid", BigDecimal.valueOf(599), ExpenseCategory.UTILITIES, getRandomDate()),
            new Expense("Smart Postpaid", BigDecimal.valueOf(599), ExpenseCategory.UTILITIES, getRandomDate()),
            new Expense("PLDT Line Bill", BigDecimal.valueOf(2000), ExpenseCategory.UTILITIES, getRandomDate()),
            new Expense("Condo Association Dues", BigDecimal.valueOf(5000), ExpenseCategory.UTILITIES, getRandomDate()),
            new Expense("Home Insurance", BigDecimal.valueOf(3000), ExpenseCategory.UTILITIES, getRandomDate()),
            new Expense("Garbage Collection Fee", BigDecimal.valueOf(200), ExpenseCategory.UTILITIES, getRandomDate()),
            new Expense("Mercury Drugstore Purchase", BigDecimal.valueOf(500), ExpenseCategory.HEALTH, getRandomDate()),
            new Expense("Watsons Toiletries", BigDecimal.valueOf(800), ExpenseCategory.HEALTH, getRandomDate()),
            new Expense("Doctor Consultation", BigDecimal.valueOf(500), ExpenseCategory.HEALTH, getRandomDate()),
            new Expense("Dental Cleaning", BigDecimal.valueOf(1500), ExpenseCategory.HEALTH, getRandomDate()),
            new Expense("Pharmacy Medicine", BigDecimal.valueOf(300), ExpenseCategory.HEALTH, getRandomDate()),
            new Expense("Salon Hair Cut", BigDecimal.valueOf(400), ExpenseCategory.HEALTH, getRandomDate()),
            new Expense("Beauty Salon Treatment", BigDecimal.valueOf(2000), ExpenseCategory.HEALTH, getRandomDate()),
            new Expense("Dermatologist Visit", BigDecimal.valueOf(1000), ExpenseCategory.HEALTH, getRandomDate()),
            new Expense("COVID Vaccine", BigDecimal.valueOf(1500), ExpenseCategory.HEALTH, getRandomDate()),
            new Expense("Lab Test", BigDecimal.valueOf(1500), ExpenseCategory.HEALTH, getRandomDate()),
            new Expense("Birthday Gift", BigDecimal.valueOf(1500), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Wedding Attire", BigDecimal.valueOf(3000), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Sundo of Relatives", BigDecimal.valueOf(200), ExpenseCategory.TRANSPORTATION, getRandomDate()),
            new Expense("Pasalubong Bought", BigDecimal.valueOf(500), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Fiesta Celebration", BigDecimal.valueOf(2000), ExpenseCategory.ENTERTAINMENT, getRandomDate()),
            new Expense("Restaurant Date Night", BigDecimal.valueOf(1500), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Barrio Fiesta Food", BigDecimal.valueOf(800), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Laundry Service", BigDecimal.valueOf(300), ExpenseCategory.UTILITIES, getRandomDate()),
            new Expense("House Help Salary", BigDecimal.valueOf(5000), ExpenseCategory.UTILITIES, getRandomDate()),
            new Expense("School Fees Child", BigDecimal.valueOf(10000), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Dinner at Romantic Restaurant", BigDecimal.valueOf(2000), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Weekend Buffet", BigDecimal.valueOf(1800), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Lechon Manok Delivery", BigDecimal.valueOf(400), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Sushi Restaurant", BigDecimal.valueOf(1200), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Italian Restaurant", BigDecimal.valueOf(1500), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Korean BBQ", BigDecimal.valueOf(2000), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Japanese Ramen", BigDecimal.valueOf(900), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Thai Restaurant", BigDecimal.valueOf(1000), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Chinese Restaurant", BigDecimal.valueOf(800), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Dessert Cafe Sweets", BigDecimal.valueOf(400), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("Lazada Order Gadgets", BigDecimal.valueOf(5000), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Shopee Clothing Purchase", BigDecimal.valueOf(2000), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Food Delivery App", BigDecimal.valueOf(600), ExpenseCategory.FOOD, getRandomDate()),
            new Expense("GCash Payment", BigDecimal.valueOf(500), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Aliexpress Gadget", BigDecimal.valueOf(1500), ExpenseCategory.SHOPPING, getRandomDate()),
            new Expense("Online Gaming Credits", BigDecimal.valueOf(2000), ExpenseCategory.ENTERTAINMENT, getRandomDate()),
            new Expense("Netflix Subscription", BigDecimal.valueOf(249), ExpenseCategory.ENTERTAINMENT, getRandomDate()),
            new Expense("Spotify Premium", BigDecimal.valueOf(129), ExpenseCategory.ENTERTAINMENT, getRandomDate()),
            new Expense("YouTube Premium", BigDecimal.valueOf(129), ExpenseCategory.ENTERTAINMENT, getRandomDate()),
            new Expense("Steam Game Purchase", BigDecimal.valueOf(800), ExpenseCategory.ENTERTAINMENT, getRandomDate())
        );
    }

    private LocalDate getRandomDate() {
        int year = LocalDate.now().getYear();
        int month = (expenseCounter % 12) + 1;
        int daysInMonth = LocalDate.of(year, month, 1).lengthOfMonth();
        int day = random.nextInt(1, daysInMonth + 1);
        expenseCounter++;
        return LocalDate.of(year, month, day);
    }
}
