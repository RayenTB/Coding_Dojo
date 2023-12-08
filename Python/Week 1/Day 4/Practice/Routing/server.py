from flask import Flask

app = Flask(__name__)

@app.route('/')
def hello_world():
    return 'Hello World!'

@app.route('/dojo')
def show_dojo():
    return 'Dojo!'

@app.route('/say/<string:name>')
def say_name(name):
    return f'Hi {name}!'

@app.route('/repeat/<int:num>/<string:word>')
def repeat_word(num, word):
    repeated_word = f'{word} ' * num
    return repeated_word.rstrip()

if __name__ == '__main__':
    app.run(debug=True, port=5000)
