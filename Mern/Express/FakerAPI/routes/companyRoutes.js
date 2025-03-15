const express = require('express');
const router = express.Router();
const { faker } = require('@faker-js/faker');

const createCompany = () => ({
    _id: faker.datatype.uuid(),
    name: faker.company.name(),
    address: {
        street: faker.address.streetAddress(),
        city: faker.address.city(),
        state: faker.address.state(),
        zipCode: faker.address.zipCode(),
        country: faker.address.country(),
    },
});

router.get('/new', (req, res) => {
    const company = createCompany();
    res.json(company);
});

router.get('/user-company', (req, res) => {
    const user = {
        _id: faker.datatype.uuid(),
        firstName: faker.name.firstName(),
        lastName: faker.name.lastName(),
        email: faker.internet.email(),
        password: faker.internet.password(),
        phoneNumber: faker.phone.number(),
    };
    const company = createCompany();
    res.json({ user, company });
});

module.exports = router;
