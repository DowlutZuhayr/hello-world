from twilio.rest import Client

account_sid = 'ACf13154230eaa9d71bcf75032cc96f838'
auth_token = 'a5fca0cf0d8a59a8b230db261e1a25f7'
client = Client(account_sid, auth_token)

message = client.messages.create(
    from_='whatsapp:+14155238886',
    body='Does it work',
    to='whatsapp:+23059789683'
)

print(message.sid)
