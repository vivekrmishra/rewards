INSERT INTO Customer (name) VALUES ('Jake');
INSERT INTO Customer (name) VALUES ('Charles');
INSERT INTO Customer (name) VALUES ('Terry');
INSERT INTO Customer (name) VALUES ('Rosa');
INSERT INTO Customer (name) VALUES ('Amy');

INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (1, '1WE2', 567.89, '2023-01-22'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (2, '1DDF', 334.45, '2023-01-02'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (3, 'JHGU', 111.11, '2023-01-12'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (4, '8UU6', 453.33, '2023-01-02'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (5, '6HHK', 55.5, '2023-01-23'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (1, '9OOI', 22.22, '2023-02-02'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (2, '6GGF', 33.33, '2023-02-03'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (3, '8SSD', 44.44, '2023-02-04'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (4, '8DDF', 34.4, '2023-02-05'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (5, '4FFF', 909.90, '2023-02-06'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (1, '3GGG', 24.54, '2023-03-23'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (2, '8JJJ', 45.66, '2023-03-24'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (3, '2DDF', 1000, '2023-03-24'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (4, '5VGB', 12.33, '2023-03-24'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (5, 'NNHJ', 45.6, '2023-03-25'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (1, 'LKFG', 34.4, '2023-04-02'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (2, 'SDXC', 23.66, '2023-04-12'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (3, '554G', 67.67, '2023-04-13'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (4, '9GHH', 12.12, '2023-04-14'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (5, '1QQQ', 67.67, '2023-04-15'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (1, 'LKFG', 34.4, '2023-04-02'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (2, 'SDXC', 23.66, '2023-04-12'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (3, '554G', 67.67, '2023-04-13'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (4, '9GHH', 12.12, '2023-04-14'); 
INSERT INTO TRANSACTION (customerId, merchantId, amount, transactionDate) VALUES (5, '1QQQ', 67.67, '2023-04-15'); 

INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-01-22', 1, 1);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (11, '2023-01-02', 2, 2);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-01-12', 3, 3);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-01-02', 4, 4);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-01-23', 5, 5);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-02-02', 1, 6);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-02-03', 2, 7);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-02-04', 3, 8);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-02-05', 4, 9);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-02-06', 5, 10);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-03-23', 1, 11);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-03-24', 2, 12);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-03-24', 3, 13);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-03-24', 4, 14);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-03-25', 5, 15);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-04-02', 1, 16);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-04-12', 2, 17);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-04-13', 3, 18);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-04-14', 4, 19);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-04-15', 5, 20);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-04-03', 1, 21);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-04-04', 2, 22);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-04-05', 3, 23);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-04-06', 4, 24);
INSERT INTO Reward (rewardPoints, rewardDate, customerId, transactionId) VALUES (10, '2023-04-07', 5, 25);