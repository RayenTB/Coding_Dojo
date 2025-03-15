const Joke = require("../models/joke.model");

// Create a new joke
module.exports.createJoke = (req, res) => {
    Joke.create(req.body)
        .then(joke => res.json(joke))
        .catch(err => res.status(400).json(err));
};

// Get all jokes
module.exports.getAllJokes = (req, res) => {
    Joke.find()
        .then(jokes => res.json(jokes))
        .catch(err => res.json(err));
};

// Get a single joke by ID
module.exports.getJoke = (req, res) => {
    Joke.findById(req.params.id)
        .then(joke => res.json(joke))
        .catch(err => res.json(err));
};

// Update a joke by ID
module.exports.updateJoke = (req, res) => {
    Joke.findByIdAndUpdate(req.params.id, req.body, { new: true, runValidators: true })
        .then(joke => res.json(joke))
        .catch(err => res.status(400).json(err));
};

// Delete a joke by ID
module.exports.deleteJoke = (req, res) => {
    Joke.findByIdAndDelete(req.params.id)
        .then(result => res.json(result))
        .catch(err => res.json(err));
};

// Ninja Bonus: Get a random joke
module.exports.getRandomJoke = (req, res) => {
    Joke.aggregate([{ $sample: { size: 1 } }])
        .then(joke => res.json(joke[0]))
        .catch(err => res.json(err));
};
