from flask import Flask ,render_template
app = Flask(__name__)    
@app.route('/color')          
def hello_world():
    return render_template('index2.html')

@app.route('/color/care/<int:nbr>')
def care(nbr):
    return render_template('index.html',nbr=nbr)


if __name__=="__main__":     
    app.run(debug=True)