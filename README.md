# GreenText
Players can write 4chan-style greentext messages.

<b>Download latest release [here](https://github.com/AleksandarHaralanov/Greentext/releases/).</b>
- Compiled on Adoptium JDK 8 and [Poseidon](https://github.com/RhysB/Project-Poseidon), fork of CB1060.
## Usage
By default, only OPs have permissions. 

Use PermissionsEx or similar plugins to grant groups the permission, enabling the greentext.
- Command:
    - `/greentext` - Does not require permission - Prints author, version, and a link to this repository.
- Message must start with:
  - `>` - Requires permission - Colors your entire message in green.
- Permission: `greentext.write`