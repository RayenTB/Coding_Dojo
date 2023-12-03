from flask import Flask

DATABASE = "usercrd"
app = Flask(__name__)
app.secret_key = "shhhhhh"
