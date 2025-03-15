const express = require('express');
const router = express.Router();
const { faker } = require('@faker-js/faker');

const createUser = () => ({
    _id: faker.datatype.uuid(),
    firstName: faker.name.firstName(),
    lastName: faker.name.lastName(),
    email: faker.internet.email(),
    password: faker.internet.password(),
    phoneNumber: faker.phone.number(),
});

router.get('/new', (req, res) => {
    const user = createUser();
    res.json(user);
});

module.exports = router;
