DROP TABLE IF EXISTS recipe;

CREATE TABLE recipe (
    id INT PRIMARY KEY,
    name VARCHAR(250),
    ingredient1 VARCHAR(250),
    ingredient2 VARCHAR (250),
    ingredient3 VARCHAR (250),
    ingredient4 VARCHAR (250),
    ingredient5 VARCHAR (250),
    ingredient6 VARCHAR (250),
    ingredient7 VARCHAR (250),
    ingredient8 VARCHAR (250),
    ingredient9 VARCHAR (250),
    amount1 VARCHAR(250),
    amount2 VARCHAR(250),
    amount3 VARCHAR(250),
    amount4 VARCHAR(250),
    amount5 VARCHAR(250),
    amount6 VARCHAR(250),
    amount7 VARCHAR(250),
    amount8 VARCHAR(250),
    amount9 VARCHAR(250),
    explanation VARCHAR(250),
    imageURL VARCHAR(250),
    recipe_Code VARCHAR(250)
);

INSERT INTO recipe (id, name, ingredient1, ingredient2, ingredient3, ingredient4, ingredient5, ingredient6, ingredient7, ingredient8, ingredient9, amount1, amount2, amount3, amount4, amount5, amount6, amount7, amount8, amount9, explanation, imageUrl) VALUES
('1', 'Spaghetti', 'Spaghetti', null, null, null, null, null, null, null, null, '1 Pck.', null, null, null, null, null, null, null, null, 'Einfach Spaghetti in Topf du Penner', 'https://image.brigitte.de/12510166/t/f9/v3/w960/r1/-/spaghetti-alla-puttanesca.jpg'),
('2', 'Burger', 'Fleisch', null, null, null, null, null, null, null, null, '10 kg', null, null, null, null, null, null, null, null, 'Drauf fetzen. Fertig.', 'https://www.edeka.de/media/01-rezeptbilder/rezeptbilder-a-d/rez-edeka-burger-the-big-american-rezept-a-d-1-1.jpg'),
('3', 'Dönerteller', 'Knoblauch-Sauce', null, null, null, null, null, null, null, null, '1 Flasche', null, null, null, null, null, null, null, null, 'Egal wie gut, Ferhat seiner ist beste.', 'https://img.restaurantguru.com/caf2-Restaurant-Ferhat-Doner-Grill-interior.jpg');