SELECT * FROM user_schema.users;
INSERT INTO users (first_name) VALUES ("rayen"),("gaith"),("houssem");
SELECT * FROM users;
SELECT * FROM users WHERE email = 'rayen@gmail.com' LIMIT 1;
SELECT * FROM users ORDER BY id DESC LIMIT 1;
UPDATE users SET last_name = 'Pancakes' WHERE id = 3;
DELETE FROM users WHERE id = 2;
SELECT * FROM users ORDER BY first_name;
SELECT * FROM users ORDER BY first_name DESC;