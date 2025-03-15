const express = require('express');
const app = express();
const PORT = 3000;

const userRoutes = require('./routes/userRoutes');
const companyRoutes = require('./routes/companyRoutes');

app.use('/api/users', userRoutes);
app.use('/api/companies', companyRoutes);

app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});
