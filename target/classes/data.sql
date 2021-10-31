DROP TABLE IF EXISTS recipe;

CREATE TABLE recipe (
    id INT PRIMARY KEY,
    name VARCHAR(250),
    ingredient1 VARCHAR(250),
    amount1 VARCHAR(250),
    explanation VARCHAR(250),
    imageURL VARCHAR(250),
    recipe_Code VARCHAR(250)
);

INSERT INTO recipe (id, name, ingredient1, amount1, explanation, imageUrl) VALUES
('1', 'Spaghetti', 'Spaghetti', '1 Pck.', 'Einfach Spaghetti in Topf du Penner', 'https://image.brigitte.de/12510166/t/f9/v3/w960/r1/-/spaghetti-alla-puttanesca.jpg'),
('2', 'Burger', 'Fleisch', '10 kg', 'Drauf fetzen. Fertig.', 'https://www.edeka.de/media/01-rezeptbilder/rezeptbilder-a-d/rez-edeka-burger-the-big-american-rezept-a-d-1-1.jpg'),
('3', 'Dönerteller', 'Knoblauch-Sauce', '1 Flasche', 'Egal wie gut, Ferhat seiner ist beste.', 'https://img.restaurantguru.com/caf2-Restaurant-Ferhat-Doner-Grill-interior.jpg');