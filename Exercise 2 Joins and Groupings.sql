//   1: Write a query to display each customer’s name (as “Customer Name”) alongside the name of the 
//   employee who is responsible for that customer’s orders. The employee name should be in a single 
//   “Sales Rep” column formatted as “lastName, firstName”. The output should be sorted alphabetically 
//   by customer name.

 SELECT customers.customerName as 'Customer Name', CONCAT(lastName, ', ', employees.firstName) AS 'Sales Rep'
FROM customers INNER JOIN employees ON customers.salesRepEmployeeNumber = employees.employeeNumber
ORDER BY customers.customerName;

//   2: Determine which products are most popular with our customers. For each product, list the total 
//   quantity ordered along with the total sale generated (total quantity ordered * priceEach) for that
//   product. The column headers should be “Product Name”, “Total # Ordered” and “Total Sale”. List the 
//   products by Total Sale descending.

SELECT products.productName AS 'Product Name', sum(orderdetails.quantityOrdered) AS 'Total # Ordered', SUM(orderdetails.quantityOrdered * orderdetails.priceEach) AS 'Total Sale'
FROM orderdetails INNER JOIN products ON orderdetails.productCode = products.productCode
GROUP BY products.productCode ORDER BY `Total Sale` DESC;

 //   3: Write a query which lists order status and the # of orders with that status. Column headers 
 //   should be “Order Status” and “# Orders”. Sort alphabetically by status.

SELECT orders.`status` AS 'Order Status',COUNT(orders.status) AS '# Orders'
FROM orders GROUP BY status ORDER BY status;

//   4: Write a query to list, for each product line, the total # of products sold from that product line. 
//   The first column should be “Product Line” and the second should be “# Sold”. Order by the second column
//   descending.

SELECT p2.productLine as "Product Line", SUM(o.quantityOrdered) as "# Sold" FROM products p JOIN orderdetails o ON p.productCode = o.productCode 
JOIN productlines p2 ON p2.productLine = p.productLine 
GROUP BY 1;


//   5: For each employee who represents customers, output the total # of orders that employee’s customers have 
//   placed alongside the total sale amount of those orders. The employee name should be output as a single 
//   column named “Sales Rep” formatted as “lastName, firstName”. The second column should be titled “# 
//   Orders” and the third should be “Total Sales”. Sort the output by Total Sales descending. Only (and all)
//   employees with the job title ‘Sales Rep’ should be included in the output, and if the employee made no 
//   sales the Total Sales should display as “0.00”.


// Still working on this one
SELECT concat(lastName, ' , ' ,firstName) AS 'Sales Rep' from customers c JOIN employees e ON c.salesRepEmployeeNumber = e.employeeNumber
SELECT products.productName AS 'Product Name', SUM(orderdetails.quantityOrdered) AS 'Total # Ordered', (product.quantityOrdered) *
SUM(orderdetails.quantityOrdered) AS 'Total Sales' FROM products p JOIN orderdetails o ON p.productCode = o.productCode GROUP BY
p.productCode ORDER BY 3 DESC; // Still working on this one



//   6: Your product team is requesting data to help them create a bar-chart of monthly sales since the 
//   company’s inception. Write a query to output the month (January, February, etc.), 4-digit year, and 
//   total sales for that month. The first column should be labeled ‘Month’, the second ‘Year’, and the 
//   third should be ‘Payments Received’. Values in the third column should be formatted as numbers with 
//   two decimals – for example: 694,292.68.