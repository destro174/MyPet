/*
 * This file is part of mypet-compat
 *
 * Copyright (C) 2011-2016 Keyle
 * mypet-compat is licensed under the GNU Lesser General Public License.
 *
 * mypet-compat is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mypet-compat is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package de.Keyle.MyPet.compat.v1_8_R2.skill.skills.ranged.bukkit;

import de.Keyle.MyPet.api.skill.skills.ranged.CraftMyPetProjectile;
import de.Keyle.MyPet.api.skill.skills.ranged.EntityMyPetProjectile;
import net.minecraft.server.v1_8_R2.EntitySmallFireball;
import org.bukkit.craftbukkit.v1_8_R2.CraftServer;
import org.bukkit.craftbukkit.v1_8_R2.entity.CraftSmallFireball;
import org.bukkit.entity.LivingEntity;

public class CraftMyPetSmallFireball extends CraftSmallFireball implements CraftMyPetProjectile {

    public CraftMyPetSmallFireball(CraftServer server, EntitySmallFireball entity) {
        super(server, entity);
    }

    @Deprecated
    public LivingEntity _INVALID_getShooter() {
        return (LivingEntity) super.getShooter();
    }

    @Deprecated
    public void _INVALID_setShooter(LivingEntity shooter) {
        super.setShooter(shooter);
    }

    public EntityMyPetProjectile getMyPetProjectile() {
        return ((EntityMyPetProjectile) this.getHandle());
    }
}