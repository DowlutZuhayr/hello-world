import qrcode

data = ''
filename = "testing.png"
img = qrcode.make(data)
img.save(filename)
