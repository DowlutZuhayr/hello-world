import qrcode

data1 = ''
filename = ""
img = qrcode.make(data1)
img.save(filename)
