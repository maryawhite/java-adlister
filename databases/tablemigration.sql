USE adlister_db;

# DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(50),
    email VARCHAR(255),
    password VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS ads (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED DEFAULT NULL,
    title VARCHAR(255),
    description TEXT,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);

# # open a terminal
# # navigate to the directory that contains this .sql file
# # mysql -u root -p < tablemigration.sql
# # After running the script, connect to the MySQL server as you have done previously.
# #
# # USE the adlister_db and use DESCRIBE and SHOW CREATE TABLE to verify that your table has been successfully created.










# USE join_test_db;
#
# DROP TABLE IF EXISTS roles;
#
# CREATE TABLE IF NOT EXISTS roles (
#     id INT UNSIGNED NOT NULL AUTO_INCREMENT,
#     name VARCHAR(100) NOT NULL,
#     PRIMARY KEY (id)
# );
#
# CREATE TABLE IF NOT EXISTS users (
#     id INT UNSIGNED NOT NULL AUTO_INCREMENT,
#     name VARCHAR(100) NOT NULL,
#     email VARCHAR(100) NOT NULL,
#     role_id INT UNSIGNED DEFAULT NULL,
#     PRIMARY KEY (id),
#     FOREIGN KEY (role_id) REFERENCES roles (id)
# );
#
# # open a terminal
# #
# #
# # mysql -u root -p < lecture_roles_users.sql
# # After running the script, connect to the MySQL server as you have done previously.
# #
# # USE the join_test_db and use DESCRIBE and SHOW CREATE TABLE to verify that your table has been successfully created.