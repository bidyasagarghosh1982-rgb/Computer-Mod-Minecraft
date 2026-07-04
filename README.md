# Computer Mod for Minecraft

A Minecraft mod that adds computer hardware components to the game. Build and craft realistic computer parts including GPU, CPU, RAM, Motherboard, Power Supply, Cooling Systems, Storage, and Computer Cases.

## Features

### Items
- 🎮 **Graphics Card (GPU)** - Visual processing component
- ⚙️ **Processor (CPU)** - Main processing unit
- 💾 **Memory Module (RAM)** - Data storage and processing
- 🔌 **Motherboard** - Central connecting component
- 🔋 **Power Supply Unit** - Energy distribution
- ❄️ **Cooling System** - Thermal management
- 💿 **Storage Drive** - Long-term data storage
- 📦 **Computer Case** - Housing for all components
- 🖥️ **Assembled Computer** - Fully built computer

### Blocks
- GPU Processing Block
- CPU Processing Block
- RAM Storage Block
- Motherboard Block
- Power Supply Block
- Cooling System Block
- Storage Block
- Computer Assembly Station

## Installation

1. Install Minecraft Forge 1.19.2
2. Download the mod JAR file from releases
3. Place it in your `mods` folder
4. Launch Minecraft with the Forge profile

## Crafting Recipes

### GPU (Graphics Card)
```
Gold Block + Diamond + Redstone
```

### CPU (Processor)
```
Iron Block + Lapis Lazuli + Redstone
```

### RAM (Memory)
```
Iron Ingot + Quartz + Redstone
```

### Motherboard
```
Coppper Block + Redstone + Gold Ingot
```

### Power Supply
```
Iron Block + Coal Block + Redstone
```

### Cooling System
```
Iron Block + Ice + Redstone
```

### Storage Drive
```
Iron Ingot + Obsidian + Redstone
```

### Computer Case
```
Iron Block + Wood + Glass
```

### Assembled Computer
```
All components combined at Assembly Station
```

## Development Setup

### Prerequisites
- Java Development Kit (JDK) 17+
- Gradle 7.0+

### Building
```bash
gradle build
```

### Running Client
```bash
gradle runClient
```

### Running Server
```bash
gradle runServer
```

## Project Structure
```
Computer-Mod-Minecraft/
├── src/main/java/com/computermod/
│   ├── ComputerMod.java              # Main mod class
│   ├── item/
│   │   └── ModItems.java             # Item registry
│   └── block/
│       └── ModBlocks.java            # Block registry
├── src/main/resources/
│   ├── META-INF/
│   │   └── mods.toml                 # Mod metadata
│   └── assets/computermod/
│       └── lang/
│           └── en_us.json            # English localization
├── build.gradle                      # Build configuration
├── gradle.properties                 # Gradle settings
└── README.md                         # This file
```

## License

MIT License - See LICENSE file for details

## Contributing

Contributions are welcome! Please feel free to submit pull requests or open issues for bugs and feature requests.

## Future Plans

- [ ] Custom textures and models for all components
- [ ] Functional blocks with custom GUIs
- [ ] Energy system and power generation
- [ ] Advanced crafting recipes
- [ ] Multiblock computer structures
- [ ] Multiplayer network features
- [ ] Configuration options

## Support

For issues, questions, or suggestions, please open an issue on GitHub.
