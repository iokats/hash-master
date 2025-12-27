# Hash Master

**Hash Master** is a lightweight and secure utility designed to verify the integrity of your files using the **SHA-512** cryptographic hash algorithm. Whether you are a developer verifying a build or a user ensuring a download hasn't been tampered with, Hash Master provides a reliable "digital fingerprint" for any file.

## 🚀 Features
- **SHA-512 Support:** Generates high-entropy 512-bit hashes for maximum security.
- **Cross-Platform:** Native installers available for both Windows and Debian-based Linux systems.
- **Integrity Verification:** Easily compare generated hashes to ensure files are identical to their source.
- **Future-Ready:** Built to expand.Support for SHA-256, SHA-3, and other algorithms can be added upon request.

---

## 📥 Installation

You can find the latest installers in the [Releases](https://github.com/iokats/hash-master/releases) section.

### Windows
1. Download the `windows-installer.exe` (or `.msi`) from the latest release.
2. Run the installer and follow the on-screen instructions.
3. Launch **Hash Master** from your Desktop or Start Menu.

### Debian / Ubuntu Linux
1. Download the `.deb` package from the latest release.
2. Open your terminal and navigate to your downloads folder.
3. Install the package using the following command:
   ```bash
   sudo apt install ./hash-master_amd64.deb