function submitData() {
	const spent = document.getElementById('expenses').value;
	const price = document.getElementById('price').value;

	// Create connection pool
	const pool = require('mysql').createPool({
		host: 'localhost',
		user: 'sqluser',
		password: 'password',
		database: 'moneytracker',
		connectionLimit: 10
	});

	// Get a connection from the pool
	pool.getConnection(function(err, connection) {
		if (err) {
			console.error('Error getting connection: ' + err.stack);
			return;
		}

		// Prepare and execute INSERT statement
		const sql = 'INSERT INTO expenses (spent, price) VALUES (?, ?)';
		connection.query(sql, [spent, price], function(err, result) {
			connection.release(); // Release connection back to pool

			if (err) {
				console.error('Error executing SQL statement: ' + err.stack);
				return;
			}

			console.log('Data inserted successfully with ID: ' + result.insertId);
			// Clear input fields
			document.getElementById('expenses').value = '';
			document.getElementById('price').value = '';
		});
	});
}